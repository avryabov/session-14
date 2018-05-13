# Session-14

Реализовать Ignite-систему, состоящую из двух узлов, так, чтобы при запуске задачи через один из узлов, она выполнилась только на другом.

Реализовано двумя способами: через клиенский узел, и через ignite.compute(cluster.forRemotes()).

    * Server.class - главный узел,
    * Client.class - клиентский узел,
    * ServerOther.class - узел с compute for remotes.
