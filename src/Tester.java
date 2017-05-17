/**
 * Created by celinaperalta on 5/17/17.
 */

import javax.sound.midi.*;

public class Tester {

    public static void main(String[] args) {

        try {

            Synthesizer synth = MidiSystem.getSynthesizer();
            Instrument[] instruments = synth.getAvailableInstruments();

            for (int i = 0; i < instruments.length; i++) {
                System.out.println(i + ": " + instruments[i].getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
