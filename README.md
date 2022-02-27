# \[ 🚧 Work in progress 👷‍♀️⛏👷🔧️👷🔧 🚧 \]

![visitors](https://visitor-badge.laobi.icu/badge?page_id=shoppe-backend)
![](https://img.shields.io/github/stars/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/forks/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/watchers/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/commit-activity/m/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/last-commit/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/repo-size/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/tokei/lines/github/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/languages/count/adrianwitaszak/shoppe-backend)
![](https://img.shields.io/github/languages/top/adrianwitaszak/shoppe-backend)

# Shoppe App - Backend

Backend for Shoppe Multiplatform App using [Ktor](https://ktor.io/) as a server. All data is stored on [MongoDB](https://www.mongodb.com/) (modern
cloud based database service). Server communicates with database using [GraphQL](https://github.com/pgutkowski/KGraphQL)
. Backend is deployed on [Heroku](https://www.heroku.com/).

This application supports
the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article -
check it out.


[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Running Locally

Make sure you have Java and Maven installed. Also, install the [Heroku Tool belt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/orangy/ktor-heroku-start.git
$ cd ktor-heroku-start
$ gradlew install
$ heroku local:start
```

Your app should now be running on [localhost:8080](http://localhost:8080/).

If you're going to use a database, ensure you have a local `.env` file that reads something like this:

```
MONGO_URI=YourMongoDatabaseAccessKey
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```
