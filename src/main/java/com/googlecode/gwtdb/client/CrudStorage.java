package com.googlecode.gwtdb.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CrudStorage<T, ID> extends Storage {
  public T create();

  public void save(T t, AsyncCallback<Void> callback);

  public void delete(T t, AsyncCallback<Void> callback);

  public void getById(ID id, AsyncCallback<T> callback);
}
