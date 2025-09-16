class VideoRunner{

public static void main(String[] args) {
        Video value = new Video();

        Song song1 = new Song(5, "Saiyaara");
        Song song2 = new Song(4, "Kesariya");
        Song song3 = new Song(6, "Believer");
        Song song4 = new Song(3, "Shape of You");

        Song[] music = { song1, song2, song3, song4 };

        value.video(music); 
    }
}
