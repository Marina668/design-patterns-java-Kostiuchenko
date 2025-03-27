public class Facade {
    public VideoFile convert(VideoFile file, Codec codec) {

        System.out.println("\n======= VideoConversionFacade: conversion started. =======");
        Codec sourceCodec = CodecFactory.extract(file);

        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile newVideoFile = BitrateReader.convert(buffer, file.getName(), codec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(newVideoFile, file.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");

        return newVideoFile;
    }
}
