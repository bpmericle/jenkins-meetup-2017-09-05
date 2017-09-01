#!/usr/bin/env groovy

def scmUrl = 'https://github.com/bpmericle/jenkins-meetup-2017-09-05.git'
def scmCredentialsId = 'github'
def scmBranch = 'master'
def scriptPath = 'src/main/jobs/pipelines/Jenkinsfile'

pipelineJob('hello-world-pipeline') {
    displayName('Hello World Pipeline Job DSL Example')
    description('This Hello World pipeline job was created by using the Job DSL/Plugin.')

    logRotator(-1,5,-1,-1)

    parameters {
        stringParam('NAME', '', 'Enter your name.')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url(scmUrl)
                        credentials(scmCredentialsId)
                    }
                    branch(scmBranch)
                }
            }
            scriptPath(scriptPath)
        }
    }
}
