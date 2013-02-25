package com.googlecode.gwtdb.client;

public @interface Order {

  public enum SortOrder {
    NOT_SPECIFIED, ASC, DESC
  }

  SortOrder value() default SortOrder.NOT_SPECIFIED;

}
