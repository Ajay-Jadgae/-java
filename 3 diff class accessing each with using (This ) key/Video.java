class Video{

public void video(Song[]song){

System.out.println(song.length);

for (int num=0;num<song.length;num++){

System.out.println(song[num]);

Song songs=song[num];
  songs.songDetails();
}

}


}