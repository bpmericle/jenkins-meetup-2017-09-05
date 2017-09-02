#!/usr/bin/env groovy

def call() {
    echo("Test stage completed with result '${currentBuild.result}'.")
}
