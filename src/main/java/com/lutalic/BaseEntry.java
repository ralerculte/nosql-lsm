package com.lutalic;

public record BaseEntry<data> (data key, data value) implements Entry<data> {

}
