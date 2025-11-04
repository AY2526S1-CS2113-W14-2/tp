# Wrooi - Project Portfolio Page

## Overview

NUStudy is a desktop app for managing students' study sessions, optimised for use via a command-line interface (CLI).
It is written in Java and uses Gradle for build management. JUnit is used for unit testing.

The notes below summarise Ooi Wen Ree A0308622J's contributions to the project.

## Summary of Contributions

### Code contributions

- Implemented ListCourseCommand.
  - Ensured output formatting and integration with UserInterface.printCourseList.
- Implemented all filter commands:
  - FilterByNameCommand — case-insensitive course code substring filter that preserves original course indices.
  - FilterByDateCommand — finds courses with sessions on a given date and prints original course indices.
  - FilterByNameAndDateCommand — exact course code + date filter that prints per-course session indices.
- Implemented ExitCommand (clean exit flow and user-facing exit message).
- Wrote unit tests covering the above commands (constructor / execute / isExit behaviours), improving method and test coverage
  for these components.
- [RepoSense Link](http://nus-cs2113-ay2526s1.github.io/tp-dashboard/?search=wrooi&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2025-09-19T00%3A00%3A00&timeframe=commit&mergegroup=&groupSelect=groupByRepos&filteredFileName=&checkedFileTypes=docs~functional-code~test-code~other)
- [Issues Assigned Link](https://github.com/AY2526S1-CS2113-W14-2/tp/issues?q=is%3Aissue%20state%3Aclosed%20assignee%3AWrooi)
- [Pull Requests Assigned Link](https://github.com/AY2526S1-CS2113-W14-2/tp/pulls?q=is%3Apr+is%3Aclosed+assignee%3AWrooi)

### User Guide (UG) contributions

- Authored the User Guide sections for:
  - Filter by course code
  - Filter by date
  - Filter by course code and date
  - List commands (clarified behaviour, examples and index retention notes)
  - Exit command
- Added examples and explanations for filter command usage, including supported date formats and index semantics.

### Developer Guide (DG) contributions

- Wrote the Appendix: Requirements section and all content through to "Appendix: Instructions for manual testing":
  - Product scope, user stories, non-functional requirements, glossary.
- Documented ListCourseCommand implementation and created the ListCourseCommand activity diagram; added explanation of
  assertion and logging behaviour.

### Tests & QA

- Added JUnit tests for ListCourseCommand, all filter commands and ExitCommand covering happy and edge cases for public
  methods.
- Improved test coverage for these commands and their interactions with CourseManager / SessionManager and UserInterface
  output.
- Example edge cases covered:
  - No courses or sessions present
  - No matching courses or sessions for filter commands
  - Invalid date inputs (including future dates) for date-based filters

### Enhancements & Implementation notes (suggested to include / fill)

- Parser & routing:
  - Implemented stricter CommandParser routing for filter commands to distinguish course-only, date-only, and
    course+date forms.
- Date handling:
  - Centralised date parsing and future-date validation in DateParser.
- UI helpers:
  - Added new UI printing helpers to render filtered results while preserving original indices.
- Diagrams & docs:
  - Created PlantUML activity diagram for ListCourseCommand and integrated it into the Developer Guide.

### Contributions to team-based tasks

Here is a non-exhaustive list of team tasks I contributed to:

- Necessary general code enhancements (parser, UI helpers)
- Maintaining the issue tracker (labels, triage notes) — Issue tracker: https://github.com/AY2526S1-CS2113-W14-2/tp/issues
- Release management (preparing release notes, tagging) — Release tracker: https://github.com/AY2526S1-CS2113-W14-2/tp/releases
- Updating user/developer docs that are not specific to a feature (e.g., documenting the Appendix: Requirements section)

### Review / mentoring contributions

Links and notes for PRs reviewed, mentoring and helping teammates:
- PR reviews by me: https://github.com/AY2526S1-CS2113-W14-2/tp/pulls?q=is%3Apr+is%3Aclosed+reviewed-by%3A%40me

Helped teammates with debugging and design discussions:
- PR: https://github.com/AY2526S1-CS2113-W14-2/tp/pull/107
- PR: https://github.com/AY2526S1-CS2113-W14-2/tp/pull/30

Bugs reported in our project (example: error handling when listing courses):
- PRs addressing bugs: https://github.com/AY2526S1-CS2113-W14-2/tp/pull/186, https://github.com/AY2526S1-CS2113-W14-2/tp/pull/196
- Issues (closed, assigned to me): https://github.com/AY2526S1-CS2113-W14-2/tp/issues?q=is%3Aissue%20state%3Aclosed%20assignee%3AWrooi%20type%3ABug
- Organized meetings to discuss and triage bugs with teammates.
- Documented bug reproduction steps and test cases for easier debugging.

### Enhancements implemented

Summary of small enhancements and improvements I implemented:

- Improved filter command UX: clarified output messages and index retention semantics.
- Improved ListCourseCommand robustness: added defensive checks and clearer logging.
- Minor parser robustness fixes: clearer error messages for invalid filter inputs.

