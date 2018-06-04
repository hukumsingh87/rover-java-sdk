package org.rover.sdk;

import org.rover.sdk.xdr.AssetType;

/**
 * Represents Rover native asset - <a href="https://www.rover.network/developers/guides/concepts/assets.html" target="_blank">laxmicoins (XLX)</a>
 * @see <a href="https://www.rover.network/developers/guides/concepts/assets.html" target="_blank">Assets</a>
 */
public final class AssetTypeNative extends Asset {

  public AssetTypeNative() {}

  @Override
  public String getType() {
    return "native";
  }

  @Override
  public boolean equals(Object object) {
    return this.getClass().equals(object.getClass());
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public org.rover.sdk.xdr.Asset toXdr() {
    org.rover.sdk.xdr.Asset xdr = new org.rover.sdk.xdr.Asset();
    xdr.setDiscriminant(AssetType.ASSET_TYPE_NATIVE);
    return xdr;
  }
}
