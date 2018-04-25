package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Member;
import models.Playlist;
import models.Song;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
  public static void index() 
  {
    Logger.info("Rendering Dasboard");
    Member member = Accounts.getLoggedInMember();
    List<Playlist> playlists = member.playlists;
    render ("dashboard.html", playlists);
  }

  public static void deletePlaylist (Long id)
  {
    Logger.info("Deleting a Playlist");
    Member member = Accounts.getLoggedInMember();
    Playlist playlist = Playlist.findById(id);
    member.playlists.remove(playlist);
    member.save();
    playlist.delete();
    redirect ("/dashboard");
  }

  public static void addPlaylist (String title)
  {
    Logger.info("Adding a Playlist");
    Member member = Accounts.getLoggedInMember();
    Playlist playlist = new Playlist (title, 0);
    member.playlists.add(playlist);
    member.save();
    redirect ("/dashboard");
  }
}
