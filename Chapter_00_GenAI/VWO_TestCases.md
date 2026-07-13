# Test Cases - VWO.com (Visual Website Optimizer)

**Project Name:** VWO.com
**Module Name:** Web Application - Experimentation & CRO Platform
**Created By:** QA Team Lead
**Created Date:** TBD
**Peer Review By:** [Name]
**Peer Reviewed Date:** TBD

---

## Scenario TS-01: User Authentication & Account Management

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-01 | TC-01.1 | Verify user can log in with valid email and password | 1. Navigate to https://app.vwo.com/ 2. Enter valid registered email 3. Enter valid password 4. Click "Log In" 5. Verify dashboard is displayed | | |
| TS-01 | TC-01.2 | Verify login fails with invalid email format | 1. Navigate to login page 2. Enter "invalid-email" 3. Enter any password 4. Click "Log In" 5. Verify error message: "Invalid email format" | | |
| TS-01 | TC-01.3 | Verify login fails with incorrect password | 1. Navigate to login page 2. Enter valid email 3. Enter incorrect password 4. Click "Log In" 5. Verify error message displayed | | |
| TS-01 | TC-01.4 | Verify login fails with unregistered email | 1. Navigate to login page 2. Enter unregistered email 3. Enter any password 4. Click "Log In" 5. Verify error message: "Account not found" | | |
| TS-01 | TC-01.5 | Verify login button is disabled when both fields are empty | 1. Navigate to login page 2. Leave email and password fields empty 3. Verify "Log In" button is disabled/greyed out | | |
| TS-01 | TC-01.6 | Verify "Forgot Password" link navigates to password reset page | 1. Navigate to login page 2. Click "Forgot Password?" link 3. Verify password reset page loads with email input field | | |
| TS-01 | TC-01.7 | Verify password reset with valid registered email | 1. Navigate to password reset page 2. Enter registered email 3. Click "Send Reset Link" 4. Verify success message: "Reset link sent to email" | | |
| TS-01 | TC-01.8 | Verify password reset fails with unregistered email | 1. Navigate to password reset page 2. Enter unregistered email 3. Click "Send Reset Link" 4. Verify error message: "Email not found" | | |
| TS-01 | TC-01.9 | Verify password field masks input (shows dots) | 1. Navigate to login page 2. Enter password 3. Verify password characters are masked (not plain text) | | |
| TS-01 | TC-01.10 | Verify "Remember Me" checkbox persists session | 1. Login with "Remember Me" checked 2. Close browser and reopen 3. Navigate to app.vwo.com 4. Verify user is still logged in | | |
| TS-01 | TC-01.11 | Verify session timeout after inactivity | 1. Log in successfully 2. Remain idle for the configured session timeout period (e.g., 24h) 3. Perform any action 4. Verify user is redirected to login page | | |
| TS-01 | TC-01.12 | Verify logout clears session | 1. Log in successfully 2. Click profile icon > "Log Out" 3. Verify redirect to login page 4. Try navigating back via browser back button 5. Verify login page persists (not cached dashboard) | | |

---

## Scenario TS-02: Dashboard & Navigation

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-02 | TC-02.1 | Verify dashboard loads with all default widgets | 1. Log in successfully 2. Verify dashboard displays: campaign overview, recent activity, quick stats 3. Verify no broken images or layout issues | | |
| TS-02 | TC-02.2 | Verify navigation sidebar has all expected modules | 1. Log in 2. Verify sidebar shows: Dashboard, Testing, Insights, Personalize, Deploy, Plan, Settings | | |
| TS-02 | TC-02.3 | Verify clicking each nav item navigates to correct page | 1. Click "Testing" 2. Verify URL contains /testing 3. Repeat for each nav item 4. Verify corresponding page loads | | |
| TS-02 | TC-02.4 | Verify "Create New Test" button is accessible from dashboard | 1. Log in 2. Locate "Create New Test" / "Create Campaign" button on dashboard 3. Verify it navigates to campaign creation page | | |
| TS-02 | TC-02.5 | Verify dashboard campaign stats show correct counts | 1. Log in 2. Verify running/paused/draft campaign counts match actual campaigns | | |
| TS-02 | TC-02.6 | Verify responsive layout on tablet viewport | 1. Open VWO on tablet viewport (768x1024) 2. Verify sidebar collapses into hamburger menu 3. Verify content reflows correctly | | |
| TS-02 | TC-02.7 | Verify responsive layout on mobile viewport | 1. Open VWO on mobile viewport (375x667) 2. Verify navigation is mobile-friendly 3. Verify all functionality remains accessible | | |

---

## Scenario TS-03: A/B Test Campaign - Creation

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-03 | TC-03.1 | Verify user can create an A/B test with a valid experiment name | 1. Navigate to Testing > Create Campaign 2. Select "A/B Test" 3. Enter valid experiment name (e.g., "Homepage CTA Test - July 2026") 4. Enter valid URL 5. Click "Create" 6. Verify campaign is created and visual editor opens | | |
| TS-03 | TC-03.2 | Verify creation fails with empty experiment name | 1. Navigate to Testing > Create Campaign > A/B Test 2. Leave "Experiment Name" empty 3. Click "Create" 4. Verify error: "Experiment name is required" | | |
| TS-03 | TC-03.3 | Verify creation with experiment name at max character limit (255 chars) | 1. Navigate to Testing > Create Campaign > A/B Test 2. Enter 255-character experiment name 3. Enter valid URL 4. Click "Create" 5. Verify campaign is created successfully | | |
| TS-03 | TC-03.4 | Verify creation fails with experiment name beyond max characters | 1. Navigate to Testing > Create Campaign > A/B Test 2. Enter 256+ character experiment name 3. Verify input does not accept more than 255 characters OR shows validation error | | |
| TS-03 | TC-03.5 | Verify creation with special characters in experiment name | 1. Enter experiment name: "Test-2026_Homepage (CTA) [v2] — Launch!" 2. Enter valid URL 3. Click "Create" 4. Verify campaign is created | | |
| TS-03 | TC-03.6 | Verify creation with invalid URL format | 1. Enter valid experiment name 2. Enter "not-a-url" in URL field 3. Click "Create" 4. Verify error: "Please enter a valid URL" | | |
| TS-03 | TC-03.7 | Verify creation with URL without protocol | 1. Enter valid name 2. Enter "www.example.com" (without https://) 3. Click "Create" 4. Verify URL is auto-corrected with https:// OR error is shown | | |
| TS-03 | TC-03.8 | Verify user can add multiple variations during creation | 1. Create A/B Test 2. Add Variation 1 (edit headline text) 3. Add Variation 2 (edit CTA button color) 4. Add Variation 3 (edit hero image) 5. Save 6. Verify all 3 variations are created | | |
| TS-03 | TC-03.9 | Verify traffic allocation across variations is configurable | 1. Create A/B Test with 2 variations 2. Set traffic split: Control 50%, Var1 30%, Var2 20% 3. Save 4. Verify split is saved correctly | | |

---

## Scenario TS-04: Visual Editor Functionality

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-04 | TC-04.1 | Verify visual editor loads the target URL correctly | 1. Create A/B Campaign 2. Click "Open Editor" 3. Verify the target website loads inside the editor iframe | | |
| TS-04 | TC-04.2 | Verify user can select an element on the page | 1. Open visual editor 2. Hover over a headline element 3. Verify element is highlighted with a blue border 4. Click to select 5. Verify element properties panel opens | | |
| TS-04 | TC-04.3 | Verify text content can be edited | 1. Select a text element in visual editor 2. Change text content 3. Click "Save" 4. Verify preview shows updated text | | |
| TS-04 | TC-04.4 | Verify CSS properties can be modified | 1. Select element in visual editor 2. Modify CSS (color, font-size, padding) 3. Save 4. Verify changes reflect in preview | | |
| TS-04 | TC-04.5 | Verify element can be hidden | 1. Select element in visual editor 2. Click "Hide" / "Delete Element" 3. Save 4. Verify element is not visible in preview | | |
| TS-04 | TC-04.6 | Verify image can be replaced | 1. Select image element in visual editor 2. Click "Replace Image" 3. Upload new image or provide URL 4. Save 5. Verify new image displays in preview | | |
| TS-04 | TC-04.7 | Verify HTML mode allows direct code editing | 1. Open visual editor 2. Switch to HTML/Code Editor mode 3. Paste custom HTML/JS/CSS 4. Save 5. Verify changes render correctly | | |
| TS-04 | TC-04.8 | Verify undo/redo functionality in editor | 1. Make multiple edits in visual editor 2. Click "Undo" 3. Verify last change is reverted 4. Click "Redo" 5. Verify change is reapplied | | |
| TS-04 | TC-04.9 | Verify custom widget creation and library access | 1. Open visual editor 2. Create a custom widget (e.g., popup form) 3. Save to widget library 4. Create new campaign 5. Add widget from library 6. Verify widget is available and functional | | |

---

## Scenario TS-05: Targeting & Segmentation

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-05 | TC-05.1 | Verify targeting by traffic source | 1. Create campaign 2. Set targeting: Traffic Source = "google" 3. Launch campaign 4. Verify only visitors from Google are included in test | | |
| TS-05 | TC-05.2 | Verify targeting by device type | 1. Create campaign 2. Set targeting: Device = "Mobile" 3. Launch campaign 4. Verify desktop visitors are excluded from test | | |
| TS-05 | TC-05.3 | Verify targeting by browser | 1. Create campaign 2. Set targeting: Browser = "Chrome" 3. Launch campaign 4. Verify Firefox visitors are excluded | | |
| TS-05 | TC-05.4 | Verify targeting by geographic location | 1. Create campaign 2. Set targeting: Country = "United States" 3. Launch 4. Verify only US-based IPs are included | | |
| TS-05 | TC-05.5 | Verify AND/OR logic for multi-condition targeting | 1. Create campaign 2. Set conditions: (Browser = Chrome AND Country = US) OR (Device = Mobile) 3. Verify logic is saved and applied correctly | | |
| TS-05 | TC-05.6 | Verify mutually exclusive campaign groups prevent visitor overlap | 1. Create Campaign Group with 2 campaigns 2. Mark as "Mutually Exclusive" 3. Launch both campaigns 4. Verify a visitor is included in only one campaign | | |
| TS-05 | TC-05.7 | Verify custom user attributes for targeting | 1. Create campaign 2. Set targeting: Custom Attribute = "logged_in" equals "true" 3. Launch 4. Verify only logged-in users are included | | |
| TS-05 | TC-05.8 | Verify targeting by behavioral data (past purchases, page visits) | 1. Create campaign 2. Set targeting: "Visited /pricing page in last 30 days" 3. Launch 4. Verify only visitors who met the condition are included | | |

---

## Scenario TS-06: Goals & Metrics Configuration

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-06 | TC-06.1 | Verify user can set a primary goal for the campaign | 1. Create campaign 2. Navigate to Goals tab 3. Set primary goal: "Click on CTA Button" 4. Save 5. Verify goal is configured | | |
| TS-06 | TC-06.2 | Verify user can add secondary metrics | 1. Create campaign with primary goal 2. Add 3 secondary metrics (page views, form submissions, revenue) 3. Save 4. Verify all metrics are listed | | |
| TS-06 | TC-06.3 | Verify guardrail metrics prevent negative business impact | 1. Create campaign 2. Configure "Revenue per Visitor" as guardrail metric 3. Set alert threshold: 5% decrease 4. Launch 5. If guardrail is breached, verify automatic pause or notification | | |
| TS-06 | TC-06.4 | Verify custom event tracking works | 1. Create campaign 2. Set goal type: "Custom Event" 3. Enter custom event name: "signup_completed" 4. Save 5. Verify events are tracked in report | | |
| TS-06 | TC-06.5 | Verify revenue tracking goal configuration | 1. Create campaign 2. Set goal: "Revenue Tracking" 3. Configure currency and value selector 4. Save 5. Verify revenue data appears in reports | | |
| TS-06 | TC-06.6 | Verify metric library shows available pre-built metrics | 1. Navigate to Goals > Metrics Library 2. Verify list of pre-built metrics is displayed 3. Select and apply a pre-built metric to a campaign 4. Verify it is added correctly | | |

---

## Scenario TS-07: Multivariate Testing (MVT)

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-07 | TC-07.1 | Verify user can create a Multivariate test campaign | 1. Navigate to Testing > Create Campaign 2. Select "Multivariate Test" (MVT) 3. Enter valid name and URL 4. Click "Create" 5. Verify MVT editor opens | | |
| TS-07 | TC-07.2 | Verify multiple elements can be tested simultaneously in MVT | 1. Create MVT campaign 2. Select element 1 (headline): create 2 variations 3. Select element 2 (CTA button): create 2 variations 4. Save 5. Verify 4 combinations are auto-generated (2x2) | | |
| TS-07 | TC-07.3 | Verify MVT combinations are displayed correctly | 1. Create MVT with 3 elements × 2 variations each 2. Navigate to "Combinations" tab 3. Verify all 8 combinations are listed 4. Preview each combination 5. Verify correct elements are applied | | |
| TS-07 | TC-07.4 | Verify user can exclude specific combinations | 1. Create MVT with 4 combinations 2. Exclude 1 combination 3. Save 4. Verify excluded combination is not served to visitors | | |
| TS-07 | TC-07.5 | Verify traffic is distributed evenly across MVT combinations | 1. Launch MVT campaign 2. Check traffic distribution report 3. Verify traffic is roughly equal across active combinations | | |

---

## Scenario TS-08: Split URL Testing

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-08 | TC-08.1 | Verify user can create a Split URL test | 1. Navigate to Testing > Create Campaign 2. Select "Split URL Test" 3. Enter experiment name 4. Enter original URL and variation URL 5. Save 6. Verify campaign is created | | |
| TS-08 | TC-08.2 | Verify visitors are correctly split between original and variation URLs | 1. Launch Split URL campaign 2. Visit original URL 3. Verify sometimes served original, sometimes variation (via redirect) 4. Check campaign report for correct traffic split | | |
| TS-08 | TC-08.3 | Verify redirect preserves query parameters and tracking | 1. Launch Split URL campaign 2. Visit original URL with query params (?utm_source=google) 3. Verify params are preserved after redirect to variation | | |
| TS-08 | TC-08.4 | Verify Split URL test with multiple variation URLs | 1. Create Split URL test with 1 control + 3 variation URLs 2. Set traffic split: 25% each 3. Launch 4. Verify all 4 URLs receive correct traffic share | | |

---

## Scenario TS-09: Campaign Management (Lifecycle)

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-09 | TC-09.1 | Verify campaign can be saved as Draft | 1. Create new campaign 2. Fill required fields 3. Click "Save as Draft" 4. Verify campaign appears in "Drafts" tab with "Draft" status | | |
| TS-09 | TC-09.2 | Verify campaign can be launched | 1. Open saved draft campaign 2. Click "Launch" / "Start" 3. Confirm launch 4. Verify campaign status changes to "Running" | | |
| TS-09 | TC-09.3 | Verify campaign can be paused | 1. Launch campaign 2. Click "Pause" 3. Confirm 4. Verify status changes to "Paused" 5. Verify visitors are no longer included in test | | |
| TS-09 | TC-09.4 | Verify campaign can be resumed from paused state | 1. Pause running campaign 2. Click "Resume" 3. Verify status changes back to "Running" 4. Verify new visitors are included in test | | |
| TS-09 | TC-09.5 | Verify campaign can be stopped | 1. Launch campaign 2. Click "Stop" 3. Confirm 4. Verify status changes to "Stopped" | | |
| TS-09 | TC-09.6 | Verify campaign can be archived | 1. Stop campaign 2. Click "Archive" 3. Confirm 4. Verify campaign moves to "Archived" section | | |
| TS-09 | TC-09.7 | Verify campaign can be deleted (if applicable) | 1. Locate draft or archived campaign 2. Click "Delete" 3. Confirm deletion 4. Verify campaign is removed 5. Verify confirmation message | | |
| TS-09 | TC-09.8 | Verify user can duplicate an existing campaign | 1. Select an existing campaign 2. Click "Duplicate" 3. Enter new name 4. Save 5. Verify duplicated campaign is created with same settings | | |
| TS-09 | TC-09.9 | Verify campaign settings can be edited after creation | 1. Open existing campaign 2. Modify name, description, traffic allocation 3. Save 4. Verify changes persist | | |

---

## Scenario TS-10: Reporting & Analytics

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-10 | TC-10.1 | Verify campaign report displays conversion metrics | 1. Click on a running/completed campaign 2. Navigate to "Report" tab 3. Verify table shows: Visitors, Conversions, Conversion Rate for each variation | | |
| TS-10 | TC-10.2 | Verify Bayesian statistics are calculated and displayed | 1. Open campaign report 2. Verify "Probability to Beat Control" is shown 3. Verify "Chance to Be Best" metric is displayed | | |
| TS-10 | TC-10.3 | Verify report can be filtered by date range | 1. Open campaign report 2. Set custom date range (Last 7 days) 3. Verify data refreshes for selected range | | |
| TS-10 | TC-10.4 | Verify report can be filtered by segment | 1. Open campaign report 2. Apply segment filter: "Mobile Traffic" 3. Verify data shows only mobile visitor performance | | |
| TS-10 | TC-10.5 | Verify CSV export functionality | 1. Open campaign report 2. Click "Export" > "CSV" 3. Verify file downloads 4. Open CSV and verify data matches on-screen report | | |
| TS-10 | TC-10.6 | Verify heatmap integration in test report | 1. Open campaign report 2. Click "Heatmap" tab 3. Verify heatmap for control is displayed 4. Switch to variation 5. Verify heatmap loads correctly | | |
| TS-10 | TC-10.7 | Verify session recording integration in test report | 1. Open campaign report 2. Click "Recordings" tab 3. Verify session recordings for test visitors are available 4. Play a recording 5. Verify timeline and events are displayed | | |
| TS-10 | TC-10.8 | Verify Sample Ratio Mismatch (SRM) alert is shown if detected | 1. Open campaign with potential SRM issue 2. Verify warning banner is displayed 3. Verify SRM details and recommendation | | |
| TS-10 | TC-10.9 | Verify report shows "Better Than Control" / "Worse Than Control" / "Practical Equivalence" | 1. Open report with sufficient data 2. Verify each variation is labeled with probability distribution | | |
| TS-10 | TC-10.10 | Verify environment-specific reports (for server-side testing) | 1. Create server-side/feature test 2. Run in staging and production environments 3. Open reports 4. Verify environment filter is available 5. Switch between environments 6. Verify data is environment-specific | | |

---

## Scenario TS-11: Rollout (Winning Variation Deployment)

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-11 | TC-11.1 | Verify user can rollout a winning variation | 1. Open completed campaign with a declared winner 2. Click "Rollout" 3. Confirm 4. Verify success message: "Variation rolled out to 100% traffic" | | |
| TS-11 | TC-11.2 | Verify rollout persists after campaign is stopped | 1. Rollout winning variation 2. Stop campaign 3. Visit test URL 4. Verify winning variation changes are still applied | | |
| TS-11 | TC-11.3 | Verify staged rollout (percentage-based) | 1. Start rollout at 10% traffic 2. Verify 10% of visitors see variation 3. Increase to 50% 4. Verify 50% see variation 5. Increase to 100% 6. Verify all visitors see variation | | |
| TS-11 | TC-11.4 | Verify user can revert a rollout | 1. Rollout winning variation at 100% 2. Click "Revert" 3. Confirm 4. Verify original (control) version is restored | | |

---

## Scenario TS-12: Account Settings & User Management

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-12 | TC-12.1 | Verify admin can create a new user in the workspace | 1. Navigate to Settings > Users 2. Click "Invite User" 3. Enter email and select role 4. Send invite 5. Verify user receives invitation email | | |
| TS-12 | TC-12.2 | Verify role-based permissions restrict access | 1. Create user with "Viewer" role 2. Log in as viewer 3. Verify viewer cannot create/edit campaigns 4. Verify viewer can view reports | | |
| TS-12 | TC-12.3 | Verify admin can edit user roles | 1. Navigate to Settings > Users 2. Change user role from "Editor" to "Admin" 3. Save 4. Log in as that user 5. Verify admin-level access is granted | | |
| TS-12 | TC-12.4 | Verify admin can remove a user | 1. Navigate to Settings > Users 2. Remove a user from workspace 3. Confirm 4. Verify user is removed from list 5. Attempt login as removed user 6. Verify access denied | | |
| TS-12 | TC-12.5 | Verify 2FA can be enabled via authenticator app | 1. Navigate to Settings > Security 2. Enable 2FA 3. Scan QR code with authenticator app 4. Enter OTP 5. Verify 2FA is enabled | | |
| TS-12 | TC-12.6 | Verify 2FA login flow works correctly | 1. Logout and login with 2FA-enabled account 2. Enter email and password 3. Enter OTP from authenticator app 4. Verify successful login | | |
| TS-12 | TC-12.7 | Verify 2FA login fails with incorrect OTP | 1. Login with 2FA-enabled account 2. Enter wrong OTP 3. Verify error message: "Invalid verification code" | | |
| TS-12 | TC-12.8 | Verify SSO (SAML 2.0) login works | 1. Configure SSO with IdP (Google/Azure/Okta) 2. Click "Log in with SSO" 3. Complete IdP authentication 4. Verify redirect back to VWO dashboard 5. Verify user is logged in | | |
| TS-12 | TC-12.9 | Verify profile settings can be updated | 1. Navigate to profile settings 2. Update name, timezone, language preference 3. Save 4. Verify changes persist after logout/login | | |

---

## Scenario TS-13: Integrations

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-13 | TC-13.1 | Verify GA4 integration can be configured | 1. Navigate to Settings > Integrations 2. Select Google Analytics 4 3. Enter GA4 Measurement ID 4. Authenticate 5. Verify connection status: "Connected" | | |
| TS-13 | TC-13.2 | Verify GA4 goal data appears in campaign reports | 1. Configure GA4 integration 2. Create campaign with GA4 goal 3. Run test 4. Open report 5. Verify GA4 tracked event data is displayed | | |
| TS-13 | TC-13.3 | Verify Slack integration for campaign notifications | 1. Navigate to Settings > Integrations 2. Configure Slack integration 3. Launch campaign 4. Verify Slack notification is received in configured channel | | |
| TS-13 | TC-13.4 | Verify integration with CDP (Segment, mParticle) | 1. Navigate to Settings > Integrations 2. Configure CDP integration 3. Verify data sync status 4. Use CDP audience for campaign targeting 5. Verify targeting works | | |
| TS-13 | TC-13.5 | Verify integration can be disconnected | 1. Navigate to configured integration 2. Click "Disconnect" / "Remove" 3. Confirm 4. Verify integration status: "Disconnected" | | |

---

## Scenario TS-14: SmartCode & SDK Installation

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-14 | TC-14.1 | Verify SmartCode snippet is generated for the account | 1. Navigate to Settings > SmartCode 2. Verify unique SmartCode snippet is displayed 3. Copy the snippet | | |
| TS-14 | TC-14.2 | Verify SmartCode installation verification tool detects correct installation | 1. Install SmartCode on test website's <head> section 2. Navigate to Settings > SmartCode 3. Click "Verify Installation" 4. Verify status: "SmartCode is installed correctly" | | |
| TS-14 | TC-14.3 | Verify SmartCode does not cause page flicker | 1. Install SmartCode on test page 2. Load page multiple times 3. Verify no visible flicker (original content showing before variation) | | |
| TS-14 | TC-14.4 | Verify SmartCode loads asynchronously (non-blocking) | 1. Open page in Chrome DevTools 2. Go to Network tab 3. Verify SmartCode loads asynchronously 4. Verify DOMContentLoaded is not blocked | | |
| TS-14 | TC-14.5 | Verify SDK integration for server-side testing (Node.js) | 1. Install VWO Node.js SDK 2. Initialize with API key 3. Create and run a feature test 4. Verify test runs correctly from server | | |
| TS-14 | TC-14.6 | Verify SDK logs errors and messages correctly | 1. Configure SDK with verbose logging 2. Trigger SDK operations 3. Verify log output contains appropriate info/error messages | | |

---

## Scenario TS-15: Feature Testing (Server-Side / FullStack)

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-15 | TC-15.1 | Verify user can create a feature flag | 1. Navigate to Testing > Feature Tests 2. Click "Create Feature Flag" 3. Enter feature key: "new_checkout_flow" 4. Enable flag 5. Save 6. Verify feature flag is created | | |
| TS-15 | TC-15.2 | Verify feature flag can be toggled on/off | 1. Open feature flag 2. Toggle to "OFF" 3. Save 4. Verify feature is disabled in SDK response 5. Toggle back to "ON" 6. Verify feature is enabled | | |
| TS-15 | TC-15.3 | Verify feature variable values can be set | 1. Create feature with variable "discount_percentage" 2. Set control value: 10 3. Save 4. Verify SDK returns correct variable value | | |
| TS-15 | TC-15.4 | Verify user can run a feature test | 1. Create feature flag 2. Enable "Run Test" mode 3. Set variation with different variable value 4. Launch test 5. Verify SDK returns different values based on traffic allocation | | |
| TS-15 | TC-15.5 | Verify feature rollout to specific user segments | 1. Create feature flag 2. Target rollout to "Internal Users" only 3. Save 4. Verify internal users see the feature 5. Verify external users do not see the feature | | |

---

## Scenario TS-16: Mobile App Testing

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-16 | TC-16.1 | Verify mobile app SDK can be integrated (Android) | 1. Integrate VWO Android SDK into test app 2. Initialize SDK with API key 3. Verify SDK initialization success in logs | | |
| TS-16 | TC-16.2 | Verify mobile app SDK can be integrated (iOS) | 1. Integrate VWO iOS SDK into test app 2. Initialize SDK with API key 3. Verify SDK initialization success in logs | | |
| TS-16 | TC-16.3 | Verify app-specific simulation environments | 1. Navigate to Settings > Mobile Apps 2. Create simulation environment for test app 3. Configure campaign targeting the app 4. Verify changes apply in simulation mode | | |
| TS-16 | TC-16.4 | Verify mobile campaign report shows device-level performance | 1. Run test on mobile app 2. Open campaign report 3. Filter by device model / OS version 4. Verify device-specific metrics are displayed | | |

---

## Scenario TS-17: AI-Powered Campaign Creation (Copilot / Wandz)

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-17 | TC-17.1 | Verify AI campaign creation via natural language prompt | 1. Navigate to Testing 2. Click "Create with AI" / "Wandz" 3. Enter prompt: "Test green vs blue CTA button on homepage hero" 4. Click "Generate" 5. Verify AI generates a campaign with variations, targeting, and metrics | | |
| TS-17 | TC-17.2 | Verify AI-generated campaign can be edited before launch | 1. Generate AI campaign 2. Verify all settings are populated (variations, targeting, goals) 3. Edit any field (e.g., traffic split) 4. Save 5. Launch 6. Verify campaign runs with modified settings | | |
| TS-17 | TC-17.3 | Verify AI suggests optimization ideas based on site analysis | 1. Navigate to Plan / Wandz 2. Request "Analyze my homepage for improvement opportunities" 3. Verify AI returns actionable suggestions | | |

---

## Scenario TS-18: Behavioral Analytics (VWO Insights)

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-18 | TC-18.1 | Verify heatmaps can be generated for a page | 1. Navigate to Insights > Heatmaps 2. Create new heatmap for a URL 3. Configure settings 4. Publish 5. Verify heatmap data is collected and displayed (click, scroll, move) | | |
| TS-18 | TC-18.2 | Verify session recordings can be played back | 1. Navigate to Insights > Recordings 2. Select a session recording 3. Play the recording 4. Verify mouse movements, clicks, scrolls are accurately replayed | | |
| TS-18 | TC-18.3 | Verify funnels can be created | 1. Navigate to Insights > Funnels 2. Create funnel with steps (Homepage > Product > Cart > Checkout) 3. Verify funnel visualization shows drop-off at each step | | |
| TS-18 | TC-18.4 | Verify form analytics tracks form interactions | 1. Navigate to Insights > Form Analysis 2. Select a form on the website 3. Verify data shows field-level engagement, drop-offs, error fields | | |

---

## Scenario TS-19: Localization & Multi-language

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-19 | TC-19.1 | Verify UI is translated in German (DE) | 1. Switch language to DE 2. Verify all navigation items, buttons, labels are in German 3. Verify no truncated or overlapping text | | |
| TS-19 | TC-19.2 | Verify UI is translated in Spanish (ES) | 1. Switch language to ES 2. Verify all UI elements are in Spanish 3. Verify date/number formats are locale-appropriate | | |
| TS-19 | TC-19.3 | Verify UI is translated in Portuguese (BR) | 1. Switch language to BR 2. Verify all UI elements are in Portuguese 3. Verify currency symbols use BRL format | | |
| TS-19 | TC-19.4 | Verify campaign names can use non-ASCII characters | 1. Create campaign with name including accented characters (e.g., "Préférences_Utilisateur") 2. Save 3. Verify name displays correctly across all screens | | |
| TS-19 | TC-19.5 | Verify fallback to English when translation is missing | 1. Switch to a locale with incomplete translations 2. Verify untranslated strings fall back to English 3. Verify no broken UI or placeholder artifacts | | |

---

## Scenario TS-20: Security & Compliance

| Scenario TID | Test Case ID | Test Case Description | Test Steps | Status | Comments |
|---|---|---|---|---|---|
| TS-20 | TC-20.1 | Verify password policy enforcement | 1. Attempt registration with weak password (e.g., "12345") 2. Verify error: "Password must be at least 8 characters with uppercase, lowercase, and number" | | |
| TS-20 | TC-20.2 | Verify SQL injection protection on login | 1. Enter email: "' OR 1=1 --" 2. Enter any password 3. Click Login 4. Verify login fails (no SQL injection) | | |
| TS-20 | TC-20.3 | Verify XSS protection in campaign name | 1. Create campaign with name: "<script>alert('XSS')</script>" 2. Save 3. Verify script is not executed (HTML-encoded) | | |
| TS-20 | TC-20.4 | Verify session cookie has Secure and HttpOnly flags | 1. Log in 2. Open Chrome DevTools > Application > Cookies 3. Verify session cookie has Secure and HttpOnly flags set | | |
| TS-20 | TC-20.5 | Verify user cannot access another workspace's data | 1. Log in as User A in Workspace A 2. Attempt to access Workspace B's campaign via direct URL manipulation 3. Verify "Access Denied" error | | |
| TS-20 | TC-20.6 | Verify API endpoints require authentication | 1. Call VWO API endpoint without API key/token 2. Verify 401 Unauthorized response | | |
