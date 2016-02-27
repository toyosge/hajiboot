package com.example.app;

import java.io.InputStream;

/**
 * Created by masahirayamamoto on 2/27/16.
 */
public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
