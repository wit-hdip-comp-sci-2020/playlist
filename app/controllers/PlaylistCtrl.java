package controllers;

import java.util.List;

import models.Playlist;
import models.Song;
import play.mvc.Controller;

public class PlaylistCtrl extends Controller
{
  public static void index()
  {
    render("playlist.html");
  }
}
