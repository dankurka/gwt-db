package com.googlecode.gwtdb.client;

public interface Cursor<T> {

  public void onData(T data);

  public void onError(/* TODO */);

  public void next();

  public boolean hasNext();

}
