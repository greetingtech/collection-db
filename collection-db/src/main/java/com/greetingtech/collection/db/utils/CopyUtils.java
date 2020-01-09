package com.greetingtech.collection.db.utils;

import com.greetingtech.collection.db.CollectionDbException;

import java.io.*;

/**
 * @author greetingtech
 * @date 2020-01-09
 */
public class CopyUtils {

    @SuppressWarnings("unchecked")
    static <T> T copy(T oldOne) {
        try {
            byte[] bytes;
            try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream()) {
                try (ObjectOutputStream objectOut = new ObjectOutputStream(byteOut)) {
                    objectOut.writeObject(oldOne);
                    bytes = byteOut.toByteArray();
                }
            }
            try (ByteArrayInputStream byteIn = new ByteArrayInputStream(bytes)) {
                try (ObjectInputStream oIn = new ObjectInputStream(byteIn)) {
                    Object newOne = oIn.readObject();
                    return (T) newOne;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new CollectionDbException(e);
        }
    }

}
