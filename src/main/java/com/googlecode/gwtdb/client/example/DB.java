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
package com.googlecode.gwtdb.client.example;

import com.google.gwt.user.client.rpc.AsyncCallback;

import com.googlecode.gwtdb.client.Create;
import com.googlecode.gwtdb.client.Delete;
import com.googlecode.gwtdb.client.Get;
import com.googlecode.gwtdb.client.Id;
import com.googlecode.gwtdb.client.Save;
import com.googlecode.gwtdb.client.example.Order.SortOrder;

import java.util.List;

public interface DB {

  @Create
  public Person createPerson();

  @Save
  public void savePerson(Person person);

  @Delete
  public void deletePerson(Person person);

  @Get("id")
  @Id
  public void getById(String id, AsyncCallback<Person> callback);

  @Get("name")
  public void getByName(String name, AsyncCallback<List<Person>> callback);

  @Get("age")
  @Range(from = "from", to = "to")
  @Limit(10)
  @Order(SortOrder.ASC)
  public void getByAge(int from, int to, AsyncCallback<List<Person>> callback);

  @Get({"firstname", "name"})
  public void getByFullName(String firstName, String name, AsyncCallback<List<Person>> callback);

}
