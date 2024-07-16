package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // example of a computer without a sound card
        Computer computerWithoutSoundCard =new Computer(Optional.empty());

        // example of a computer with a sound card without USB
        SoundCard soundCardWithoutUSB = new SoundCard(Optional.empty());
        Computer computerWithSoundCardNoUSB = new Computer(Optional.of(soundCardWithoutUSB));

        // example of a computer with a sound card and USB
        USB usb = new USB("2.0");
        SoundCard soundCardWithUSB = new SoundCard(Optional.of(usb));
        Computer computerWithSoundCardAndUSB = new Computer(Optional.of(soundCardWithUSB));

        // get the USB version from each computer
        System.out.println("Computer without sound card: " + getUSBVersion(computerWithoutSoundCard));
        System.out.println("Computer with sound card no USB: " + getUSBVersion(computerWithSoundCardNoUSB));
        System.out.println("Computer with sound card and USB: " + getUSBVersion(computerWithSoundCardAndUSB));
    }

    public static String getUSBVersion(Computer computer) {
        return computer.getSoundCard()
                .flatMap(SoundCard::getUsb)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
    }
}
