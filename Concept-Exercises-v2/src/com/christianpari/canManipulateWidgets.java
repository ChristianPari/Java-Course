package com.christianpari;

// Interfaces can have multiple parents!!
public interface canManipulateWidgets
        extends Draggable, Resizable {
  void render();
}

