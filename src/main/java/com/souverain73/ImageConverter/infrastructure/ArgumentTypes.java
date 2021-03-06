package com.souverain73.ImageConverter.infrastructure;

public class ArgumentTypes {
    public static ArgumentParser intVal = Integer::valueOf;
    public static ArgumentParser longVal = Long::valueOf;
    public static ArgumentParser floatVal = Double::valueOf;
    public static ArgumentParser stringVal = String::valueOf;
    public static ArgumentParser booleanVal = Boolean::valueOf;
}
