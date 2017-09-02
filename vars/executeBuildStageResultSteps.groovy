#!/usr/bin/env groovy

def call() {
    echo("Build stage completed with result '${currentBuild.result}'.")
}
