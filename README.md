# Habit-Pal

## Table of Contents
1. [Overview](#Overview)
2. [Product Spec](#Product-Spec)
3. [Wireframes](#Wireframes)

## Overview
### Description
Helps an individual track their progress towards breaking bad habits and/or forming good ones. It keeps the user on track with reminders and goals. Once a habit is created or a milestone is reached, the user can share their progress on their connected social media platforms if they choose.

### App Evaluation
- **Category:** Productivity / Wellness
- **Mobile:** This app would be primarily developed for mobile but would be just as viable on a computer, via a website or browser extension. Functionality wouldn't be limited to mobile devices, however mobile version could potentially have more features like easy-to-access notifications, and progress pictures.
- **Story:** Aims to improve the users life, providing suggestions on new habits to form/break, as well as allowing them to choose their own.
- **Market:** Any individual could choose to use this app, as anyone could choose to improve their well-being and overall quality of life. Users who prioritize self-wellness would be the most likely users.
- **Habit:** Depending on the goals the user sets, this app could be used hourly, daily, or monthly. It all depends on when they set reminders and goals.
- **Scope:** The app idea is focused enough that it could reasonably  be created within a few weeks, implementing most - if not all the features noted above.

## Product Spec
### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [ ] User can register with their email address.
- [ ] User can log in to access their habits.
- [ ] User can create a new habit to track - based off of suggestions, or from scratch. They can specify whether this is a habit they would like to form or break.
- [ ] User can set milestones/goals (21 days recommended)
- [ ] User can set push-notification reminders for each habit they're tracking.
- [ ] User can edit their habit name, milestones/goals, and reminders for each habit.

**Optional Nice-to-have Stories**

- [ ] User can share their new habits and completed milestones/goals to their social media accounts.
- [ ] User can take pictures to track their progress with specific habits.

### 2. Screen Archetypes

* Login 
    * User logs into their account
* Register
    * User signs up for their account
* Profile Screen 
   * Allows user to upload a photo and edit profile info
* Settings Screen
   * Lets user change language, and app notification settings.
* Habits to Quit 
    * User can view a list of the habbits they want to quit
* Habits to Form 
    * User can view a list of the habits that they want to form
* Create Habbit 
    * User can create a new habbit that they either want to quit or form
* Habit detail 
    * lets users view a detailed screen opf their habbit as well as a timeline showing their progress with the particular habbit

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Profile
* Habits to quit
* Habits to form

**Flow Navigation** (Screen to Screen)
* Login -> Register
* Register -> Login
* Login -> Habits to form/break (User specifies their "main screen")
* Register -> Habits to form/break (User specifies their "main screen")
* Profile -> Settings
* Profile -> Login screen (Logout)
* Habits to form/break -> Create new habit
* Habits to form/break -> Habit details

## Wireframe
<img src="https://i.ibb.co/30k59dV/IMG-20220408-182542825.jpg" width=800><br>

## Digital Wireframes
<img src="https://i.ibb.co/hZbm1hh/Screenshot-20220409-113259-794.png" width=200> <img src="https://i.ibb.co/4m6RtSq/Screenshot-20220409-113355-330.png" width=200> <img src="https://i.ibb.co/Zh3YR6d/Screenshot-20220409-113433-726.png" width=200> <img src="https://i.ibb.co/FnvJmt6/Screenshot-20220409-113542-083.png" width=200> <img src="https://i.ibb.co/4JvcYyQ/Screenshot-20220409-113643-389.png" width=200> <img src="https://i.ibb.co/t3n84yC/Screenshot-20220409-113716-200.png" width=200>

## Schema

**User:**
| Property      | Type           | Description                                  |
| ------------- |:-------------: | -----                                       |
| user_id       | Int            | Unique identifier                            |
| email         | String         | Email address                                |
| first_name    | String         | First name                                   |
| last_name     | String         | Last name                                    |
| phone         | String         | Phone number                                 |
| date_of_birth | Date           | Date of birth                                |
| avatar        | Url (image)    | Avatar image                                 |
| habit_score   | Int            | Score attained via reaching goals/milestones |


**Habit:**
| Property      | Type           | Description                                                  |
| ------------- |:-------------: | -----                                                        |
| id            | Int            | Unique identifier                                            |
| user_id       | Int            | Unique *user* identifier                                     |
| name          | String         | Name                                                         |
| type          | String         | Good vs. Bad                                                 |
| reminders     | Boolean        | Whether the user wants reminder notifications for the habit  |
| goal          | Int            | How many days the user wants to track habit                  |
| milestone     | Int            | What frequency of days would count as a milestone            |
| image         | Url (image)    | Image (optional)                                             |
| points        | Int            | Points added to users habit score for completion             |