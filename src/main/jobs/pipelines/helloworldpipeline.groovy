#!/usr/bin/env groovy

pipelineJob('hello-world-pipeline') {
    displayName('Hello World Pipeline Job DSL Example')
    description('This Hello World pipeline job was created by using the Job DSL/Plugin.')

    logRotator(-1,5,-1,-1)

    parameters {
        stringParam('NAME', '', 'Enter your name.')
    }
}
