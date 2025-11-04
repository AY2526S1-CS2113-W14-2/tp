# Lim Yik Jin — Project Portfolio Page

## Overview

[NUStudy](https://github.com/AY2526S1-CS2113-W14-2/tp), an NUS CS2113 team project (tP), by [team W14-2 during AY2025/26
Semester 1](https://github.com/AY2526S1-CS2113-W14-2), is a desktop app for managing study hours, optimised for use via
a command-line interface (CLI). If you can type fast, NUStudy can get your study management tasks done faster than
traditional GUI apps.

NUStudy is written in Java 17 LTS, and uses Gradle 7.6.2 as its build automation tooling, with JUnit 5.10.0 for unit
testing.

The documentation below summarises contributions made by me ([@yikjin](https://github.com/yikjin/)) to the NUStudy
project.

## Summary of contributions

An overview of my code contributions can be viewed from multiple places:

- [My RepoSense statistics](https://nus-cs2113-ay2526s1.github.io/tp-dashboard/?search=yikjin&breakdown=true)
- [NUStudy GitHub issues authored by me](https://github.com/AY2526S1-CS2113-W14-2/tp/issues?q=is%3Aissue%20author%3Ayikjin)
- [NUStudy GitHub issues assigned to me](https://github.com/AY2526S1-CS2113-W14-2/tp/issues?q=is%3Aissue%20assignee%3Ayikjin)
- [NUStudy GitHub pull requests authored by me](https://github.com/AY2526S1-CS2113-W14-2/tp/pulls?q=is%3Apr+author%3Ayikjin)
- [NUStudy GitHub pull requests reviewed by me](https://github.com/AY2526S1-CS2113-W14-2/tp/pulls?q=is%3Apr+reviewed-by%3Ayikjin)

### Code contributions

- Implement viewing of hours for each study session ([#45](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/45))
- Implement updating of hours for a specific study session by index ([#104](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/104))
- Fix `quit` command not working due to accidental code deletion by another teammate ([#44](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/44))
- Fix study session not added to 'SessionManager' when adding new study session ([#45](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/45))
- Fix `delete <course>` not shown in `delete` command usage hints ([#183](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/183))
- Fix `add <course> <hours> <date>` not shown in `add` command usage hints ([#184](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/184))
- Fix Java logger unintentionally printing to console ([#185](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/185))

### User guide contributions

- Add initial user guide for v1.0 ([#49](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/49))
- Update layout and order of the user guide for v2.0 ([#107](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/107))
- Fix rendering of GitHub Pages not rendering GitHub Flavoured Markdown (GFM) alerts, replacing it with a regular
  block instead ([#111](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/111))
- Update user guide to fix links in table of contents and command guide ([#203](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/203))
- Update help command to specify adding course without date assumes today's date ([#203](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/203))
- Clarify input caret to state that the input caret (`> `) is not visible in the program itself ([#206](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/206))

### Developer guide contributions

- Add session component, and session class diagram to developer guide ([#120](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/120))
- Update session class diagram to follow course standard, removing the class icons and shapes for each line ([#197](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/197))
- Format developer guide to be more consistent with AB3 ([#113](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/113))

### Testing and QA contributions

- Add JUnit tests, Java logging, and `assert` statements to the update course session hours feature ([#104](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/104))
- Contribute to JAR smoke testing and bug hunting (e.g. [#41](https://github.com/AY2526S1-CS2113-W14-2/tp/issues/41),
  [#43](https://github.com/AY2526S1-CS2113-W14-2/tp/issues/43), [#46](
  https://github.com/AY2526S1-CS2113-W14-2/tp/issues/46), [#215](https://github.com/AY2526S1-CS2113-W14-2/tp/issues/215
  ))

### Team-based contributions

- Release management to [GitHub releases](https://github.com/AY2526S1-CS2113-W14-2/tp/releases)
- Manage the [GitHub project board](https://github.com/orgs/AY2526S1-CS2113-W14-2/projects/1), keeping it up-to-date
  with the statuses of milestones, issues and pull requests
- Update Git repository files, and project setting files ([#39](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/39))
    - Update '.gitignore', '.gitattributes' Git repository files
    - Add project setting files like '.idea/codeStyles/codeStyleConfig.xml' and '.idea/inspectionProfiles/Default.xml'
      to enable IntelliJ IDEA code style formatting and linting
- Remove all instances of 'Duke' ([#188](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/188))
- Assign correct labels and other metadata to issues and pull requests when missed by teammates
- Close issues when related pull requests merged, but the relevant issues were missed by teammates (e.g. [#137](
  https://github.com/AY2526S1-CS2113-W14-2/tp/issues/137), [#145](https://github.com/AY2526S1-CS2113-W14-2/tp/issues/145
  ), [#201](https://github.com/AY2526S1-CS2113-W14-2/tp/issues/201))

### Review contributions

Here is a list of [pull requests reviewed by me](
https://github.com/AY2526S1-CS2113-W14-2/tp/pulls?q=is%3Apr+reviewed-by%3Ayikjin), with the below pull requests with
changes requested by me:

- fix: Reset logged hours matching UI output ([#51](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/51))
- Load data from txt file ([#63](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/63))
- Filter course by name and date ([#105](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/105))
- Bug fix filter by date ([#109](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/109))
- Update help command ([#187](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/187))
- fix: UG add help command and separate add session with data and without date ([#194](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/194))
- fix: Prevent HelpCommand from accepting parameters ([#213](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/213))
- Update use cases in DG ([#220](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/220))
- refactor: Split reset in help into 2 distinct commands ([#223](https://github.com/AY2526S1-CS2113-W14-2/tp/pull/223))

### Contributions beyond the project team

Here is a list of [all forum contributions by me](
https://github.com/nus-cs2113-AY2526S1/forum/issues?q=is%3Aissue%20involves%3Ayikjin), detailed below:

- [Flag Java coding exercise details in Coursemology pointing to old version](
  https://github.com/nus-cs2113-AY2526S1/forum/issues/1#issuecomment-3210679649)
- [Flag inconsistency in deadlines for Java coding exercise](
  https://github.com/nus-cs2113-AY2526S1/forum/issues/1#issuecomment-3213197438)
- Respond to what commit tagging is ([#6](https://github.com/nus-cs2113-AY2526S1/forum/issues/6#issuecomment-3210621132
  ))
- Report Coursemology's unexpected use of Java 11 instead of 17 being undocumented ([#7](
  https://github.com/nus-cs2113-AY2526S1/forum/issues/7))
- Seek clarifications on Java coding standard ([#9](https://github.com/nus-cs2113-AY2526S1/forum/issues/9))
- Help troubleshoot issue of commits not belonging to any branch ([#12](
  https://github.com/nus-cs2113-AY2526S1/forum/issues/12#issuecomment-3283377912))

### Other contributions

- Update package name from 'seedu.nustudy' to 'arpa.home.nustudy' ([#39](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/39))
- Attempt to upgrade Gradle build tooling version from 7.6.2 to 9.1.0 ([#39](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/39), revert in [#52](
  https://github.com/AY2526S1-CS2113-W14-2/tp/pull/52))
    - Gradle upgrade breaks the GitHub Actions CI runner, causing the build step at
      `gradle/actions/wrapper-validation@v3` to only succeed about once every hour or so, due to outdated version
      `v3` used. Revert done instead of updating the '.github/workflows/gradle.yml' file, since this was deemed too
      risky to do.
