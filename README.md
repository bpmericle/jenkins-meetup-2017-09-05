# jenkins-meetup-2017-09-05
This repository contains code demoed at the DFW Jenkins Area Meetup on September 5th, 2017.

## Checklist
1. Start up fresh Jenkins 2.60.x.

    I typically use Docker for local testing. https://github.com/jenkinsci/docker/blob/master/README.md

2. Install Job DSL Plugin (id: job-dsl https://wiki.jenkins-ci.org/display/JENKINS/Job+DSL+Plugin)

    Manage Jenkins > Manage Plugins > Available Tab > Filter using "job-dsl"

3. Install Authorize Project Plugin (id: authorize-project https://wiki.jenkins-ci.org/display/JENKINS/Authorize+Project+plugin)

    Manage Jenkins > Manage Plugins > Available Tab > Filter using "authorize-project"

4. Setup Authorize Project Plugin

    Manage Jenkins > Configure Global Security > Access Control for Builds > Add > Project default Build Authorization: Run as User who Triggered Build

5. Create seed freestyle job

    - Source Code Management > Git > Repositories > Repository URL: https://github.com/bpmericle/jenkins-meetup-2017-09-05.git
    - Build > Process Job DSLs
        - Look on Filesystem > DSL Scripts: src/main/jobs/helloworld.groovy
        - Use Groovy Sandbox: checked
        - Action for removed jobs: Delete
        - Action for removed views: Delete
        - Action for removed config files: Delete
