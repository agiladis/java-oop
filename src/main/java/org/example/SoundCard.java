package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public class SoundCard {
    private Optional<USB> usb;
}
