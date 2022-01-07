class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand.replace('A','U').replace('T','A').replace('G','X').replace('C','G').replace('X','C');
    }

}