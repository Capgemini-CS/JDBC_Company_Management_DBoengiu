package com.capgemini;

import java.util.List;

public interface Repository<T> {
    List<T> read();
}
