/*
 * Copyright 2012 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtdb.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DB {

  public Person createPerson();

  public void savePerson(Person person);

  public void deletePerson(Person person);

  public void getById(String id, AsyncCallback<Person> callback);

  public void getByName(String name, AsyncCallback<Person> callback);

}
