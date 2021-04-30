package controllers;

import java.util.List;

import models.Playlist;
import models.Song;
import play.Logger;
import play.mvc.Controller;
import utils.PlaylistAnalytics;

public class PlaylistCtrl extends Controller
{
  public static void index(Long id)
  {
    Playlist playlist = Playlist.findById(id);
    Logger.info ("Playlist id = " + id);
    Song shortestSong = PlaylistAnalytics.getShortestSong(playlist.songs);
    render("playlist.html", playlist, shortestSong);
  }

  public static void deletesong (Long id, Long songid)
  {
    Playlist playlist = Playlist.findById(id);
    Song song = Song.findById(songid);
    Logger.info ("Removing" + song.title);
    playlist.songs.remove(song);
    playlist.save();
    song.delete();
    render("playlist.html", playlist);
  }

  public static void addSong(Long id, String title, String artist, int duration)
  {
    Song song = new Song(title, artist, duration);
    Playlist playlist = Playlist.findById(id);
    playlist.songs.add(song);
    playlist.save();
    redirect ("/playlists/" + id);
  }
}
