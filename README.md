# GraalVM Clojure with instaparse

Inspired by this: https://github.com/lread/clj-graal-docs/blob/master/doc/hello-world.md

## Prerequisites

- Leiningen
  - https://leiningen.org/#install
- GraalVM
  - Download GraalVM and extract directory `$SOMEWHERE`
    - https://github.com/oracle/graal/releases
  - Run `$SOMEWHERE/Contents/Home/bin/gu install native-image`

## Running

```
lein uberjar
NATIVE_IMAGE="$SOMEWHERE/Contents/Home/bin/native-image" ./compile
./hello-world
```
