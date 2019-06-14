Related Resources and Integration Testing

## Feature Tasks
Feature Tasks

Create a Song model.

A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.

Ensure that the relationship between Albums and Songs is appropriately set up.

A user should be able to see information about all the songs on the site.

A user should be able to view a page with data about one particular album.

A user should be able to add songs to an album.

A user should be able to see the songs that belong to an album when looking at that album.


## Testing
Write integration tests for your hello world routes.

As a stretch goal, add integration testing for the routes you’ve created today.

Make sure your server fails gracefully. 
The server shouldn’t crash and the database shouldn’t be corrupted in any way if a user attempts to read or manipulate information that doesn’t exist.


## Instructions on running the app:

The app can be run from web browser.
On the web browser type localhost:8080/(parameters)
(parameters) can be:

 song: Once on the song page, a user can look at the list of all songs that are in the database and add songs to the existing database.

album: User can see what albums are already there and add albums on the database.

If user adds songs to the database, if album is already existing, then the song will also be added to the album. If not then new album will be created.




[Link to Album.java](https://github.com/sadhikari07/songr/blob/master/src/main/java/com/sudadh/code401javaSongr/songrLab/SongrController.java)

[Link to AlbumController.java](https://github.com/sadhikari07/songr/blob/master/src/test/java/com/sudadh/code401javaSongr/songrLab/SongrControllerTest.java)

[Link to album.html](https://github.com/sadhikari07/songr/blob/master/src/main/java/com/sudadh/code401javaSongr/songrLab/SongrController.java)


[Link to Song.java](https://github.com/sadhikari07/songr/blob/master/src/main/java/com/sudadh/code401javaSongr/songrLab/Song.java)

[Link to SongController.java](https://github.com/sadhikari07/songr/blob/master/src/main/java/com/sudadh/code401javaSongr/songrLab/SongController.java)

[Link to song.html](https://github.com/sadhikari07/songr/blob/master/src/main/resources/templates/song.html)

[Link to test](https://github.com/sadhikari07/songr/blob/master/src/test/java/com/sudadh/code401javaSongr/songrLab/SongControllerTest.java)
