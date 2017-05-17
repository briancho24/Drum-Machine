/**
 * Created by celinaperalta on 5/17/17.
 */

import javax.sound.midi.*;


public class Controller {

    //Takes an array of instruments, a mixer, and a player and controls everything somehow


    private Synthesizer synth;
    private Instrument[] instruments = new Instrument[12];

    public Controller() throws Exception {

        synth = MidiSystem.getSynthesizer();

        for (int i = 0; i < instruments.length; i++) {

        }


    }

    public void playLoop() {

    }

    public void addLoop(String instrument, int beat) {

    }

    public void clearLoop() {

    }


}
