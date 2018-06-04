echo "machine github.com login rover-jenkins password $GITHUB_TOKEN" >~/.netrc
git clone -b gh-pages "https://bitbucket.org/kaluramlaxmicoin/rover-java-sdk.git" javadoc

if [ ! -d "javadoc" ]; then
  echo "Error cloning"
  exit 1
fi

rm -rf javadoc/* # Remove all files without hidden (.git)
javadoc -public -splitindex -windowtitle "rover-java-sdk documentation" -d ./javadoc -sourcepath ./src/main/java/ -subpackages org.rover.sdk -exclude org.rover.sdk.xdr
cd javadoc
git add .
git commit -m $TRAVIS_TAG
git push origin gh-pages
