Microservices workshop, most of the modules are Spring, any other technology is welcome.

1. Install docker
2. Import project
3. To run as docker container, build your module by `mvn package docker:build` 
and run by `docker run -p 8080:8080 team-clock/tick-tock` for example for tick-tock project
4. To run all, execute `docker-compose up`, each of the modules must be build by `mvn package docker:build` before
5. To run some, execute `docker-compose up tick-tock mongodb` to run just tick-tock and mongo 
6. In case of having an error like "ERROR: for tick-tock  No such image: sha256:7470a1a14ff0538ca423fea1120e7169f57cdd5d6970d989ab4b3b56db2ad910" follow instructions from https://stackoverflow.com/questions/37454548/docker-compose-no-such-image

clock-face:
return current clock status `/{team}` and/or `/{team}/{duty}`

tick-tock:
move hand of a clock forward
/{team}/{duty}

rest-repository:
expose necessary methods

Docker:MongoDB:
expose MongoDB, ?

web:
use tick-tock and clock-face on the web interface

tests?
integration tests

