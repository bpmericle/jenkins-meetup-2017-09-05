#!/usr/bin/env groovy

def call() {
    echo("Deploy stage completed with result '${currentBuild.result}'.")
}
