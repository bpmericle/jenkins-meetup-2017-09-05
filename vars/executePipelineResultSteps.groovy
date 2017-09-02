#!/usr/bin/env groovy

def call() {
    echo("Pipeline completed for ${NAME} with result '${currentBuild.result}'.")
}
