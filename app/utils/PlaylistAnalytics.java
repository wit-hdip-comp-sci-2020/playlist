package utils;

import models.Song;

import java.util.List;

public class PlaylistAnalytics {
  public static Song getShortestSong(List<Song> songs) {
    Song shortestSong = null;
    if (songs.size() > 0) {
      shortestSong = songs.get(0);
      for (Song song : songs) {
        if (song.duration < shortestSong.duration) {
          shortestSong = song;
        }
      }
    }
    return shortestSong;
  }
}
