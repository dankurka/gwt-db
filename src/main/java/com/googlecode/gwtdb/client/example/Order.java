package com.googlecode.gwtdb.client.example;

public @interface Order {

  public enum SortOrder {
    NOT_SPECIFIED, ASC, DESC
  }

  SortOrder value() default SortOrder.NOT_SPECIFIED;

}
