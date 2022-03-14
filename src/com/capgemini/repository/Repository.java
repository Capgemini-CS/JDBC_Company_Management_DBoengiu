package com.capgemini.repository;

import java.util.List;

public interface Repository<T> {
    List<T> readAllValues();

}
