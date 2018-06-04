package org.rover.sdk.responses;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.rover.sdk.KeyPair;

import java.io.IOException;

class KeyPairTypeAdapter extends TypeAdapter<KeyPair> {
  @Override
  public void write(JsonWriter out, KeyPair value) throws IOException {
    // Don't need this.
  }

  @Override
  public KeyPair read(JsonReader in) throws IOException {
    return KeyPair.fromAccountId(in.nextString());
  }
}
