# Test Plan - VWO.com (Visual Website Optimizer)

---

## 1. Objective
The objective of this test plan is to define the scope, approach, resources, and schedule for the testing of VWO.com — an experimentation and conversion rate optimization (CRO) platform. Testing will validate that all core functionalities (A/B testing, multivariate testing, split URL testing, feature testing, visual editor, targeting/segmentation, reporting, dashboards, user management, integrations, SmartCode/SDK installation, and account settings) work as per the PRD across web, mobile app, and server-side environments.

---

## 2. Scope

### In Scope
- User registration, login, authentication (including SSO, 2FA), password reset, and account management
- Dashboard: navigation, widgets, campaign overview, quick actions
- A/B Test Campaign lifecycle: Create, Edit, Pause, Resume, Stop, Archive, Delete
- Multivariate Testing (MVT) campaign creation and management
- Split URL Testing campaign creation and management
- Feature Testing (Server-side) via feature flags
- Visual Editor: element selection, modifications (text, CSS, HTML, images), undo/redo, widget library, code editor
- Targeting & Segmentation: traffic source, device type, OS, browser, behavioral data, custom attributes, AND/OR logic, mutually exclusive groups
- Goals/Metrics: primary, secondary, guardrail metrics, custom events, revenue tracking, metric library
- Reporting: Bayesian statistics, real-time reports, CSV export, comparison of metrics/segments, environment-specific reporting
- Behavioral Analytics integration: heatmaps, session recordings, funnel analysis in test reports
- Rollout: deploying winning variations to production
- Account Settings: user permissions, role-based access, sub-accounts, workspace management
- Integrations: GA4, Mixpanel, Segment, Slack, CMS platforms, CDPs
- SmartCode installation and SDK integration (Node.js, Ruby, Python, PHP, Java, .NET, iOS, Android)
- AI-powered campaign creation (Copilot/Wandz)
- Mobile app testing: SDK integration, app-specific simulations, device-level reporting
- Localization: multi-language support (EN, DE, ES, BR)
- Security: 2FA, SSO (SAML 2.0), role-based permissions, data encryption

### Out of Scope
- Performance/load testing of customer websites running VWO SmartCode (third-party infrastructure)
- Security penetration testing of VWO's internal infrastructure
- Third-party application functionality testing (GA4, Mixpanel, etc.)
- Billing and payment gateway testing
- Mobile app testing on physical devices (will be tested only on emulators/simulators for this phase)

---

## 3. Inclusions
- Functional testing (positive, negative, boundary, edge cases)
- UI/UX testing (cross-browser, responsive design, visual consistency)
- Integration testing (third-party tools, APIs, SDKs, SmartCode)
- Regression testing
- Usability testing
- Security testing (2FA, SSO, permissions, data privacy)
- Localization testing (EN, DE, ES, BR)
- Cross-device testing (desktop, tablet, mobile)
- Cross-browser testing (Chrome, Firefox, Safari, Edge)

---

## 4. Test Environments

| Environment | Details |
|-------------|---------|
| **Production (UAT)** | https://app.vwo.com/ |
| **Staging/QA** | Internal staging environment provided by Dev team |
| **Browsers** | Chrome (latest), Firefox (latest), Safari (latest), Edge (latest) |
| **Mobile** | Android (12+), iOS (15+) - Emulators/Simulators |
| **Network** | Broadband (100 Mbps), Throttled (3G), Offline mode |
| **Screen Resolutions** | 1920x1080, 1366x768, 768x1024 (tablet), 375x667 (mobile) |

---

## 5. Defect Reporting Procedure
1. All defects will be logged in **JIRA** with the following mandatory fields:
   - **Summary**: Clear, descriptive title
   - **Environment**: URL, Browser, OS, Device
   - **Steps to Reproduce**: Numbered steps
   - **Actual Result**: Observed behavior
   - **Expected Result**: Expected behavior as per PRD
   - **Severity**: Blocker / Critical / Major / Minor / Trivial
   - **Priority**: P0 / P1 / P2 / P3
   - **Attachment**: Screenshot / Screen recording / Logs
2. Defect lifecycle: New → Triaged → Assigned → In Progress → Fixed → Ready for Retest → Verified → Closed
3. P0 and P1 defects to be reported immediately via Slack to QA Lead and Dev Lead
4. Daily defect triage meeting at 10:00 AM IST

---

## 6. Test Strategy

| Test Type | Approach | Tools |
|-----------|----------|-------|
| **Functional Testing** | Manual + Automation (UI & API) | Selenium WebDriver / Playwright, Postman / REST Assured |
| **UI/UX Testing** | Manual cross-browser testing | BrowserStack, Responsive Design Checker |
| **API Testing** | Validate REST APIs for campaign CRUD, user management, reports | Postman, REST Assured |
| **Regression Testing** | Automated test suite execution on every build | Playwright + GitHub Actions |
| **Integration Testing** | Verify SmartCode + SDK integration + third-party connectors | Custom scripts, VWO debugger |
| **Security Testing** | 2FA, SSO, permission escalation tests | OWASP ZAP, manual testing |
| **Localization Testing** | Verify UI strings in DE, ES, BR locales | Manual |
| **Mobile App Testing** | SDK integration, device-level behavior | Android Studio, Xcode simulators |
| **SmartCode/SDK Testing** | Verify SmartCode injection, flicker-free loading, SDK events | VWO Debugger, Browser DevTools, Network tab |

---

## 7. Test Schedule

| Phase | Start Date | End Date | Duration |
|-------|-----------|---------|----------|
| Test Planning & Environment Setup | TBD | TBD | 3 days |
| Test Case Design & Review | TBD | TBD | 5 days |
| Smoke / Sanity Testing | TBD | TBD | 1 day |
| Functional Testing (Phase 1) | TBD | TBD | 10 days |
| Integration Testing | TBD | TBD | 5 days |
| UI/UX + Cross-browser Testing | TBD | TBD | 5 days |
| Regression Testing | TBD | TBD | 5 days |
| UAT / Bug Fix Verification | TBD | TBD | 5 days |
| Test Closure & Sign-off | TBD | TBD | 2 days |

---

## 8. Test Deliverables
- Test Plan document (this document)
- Test Cases (Excel/JIRA - importable format)
- Test Execution Reports (daily/weekly)
- Defect Reports (JIRA dashboard)
- Automation Test Scripts (Playwright)
- API Test Collection (Postman)
- Test Summary Report (at closure)
- Sign-off document

---

## 9. Entry and Exit Criteria

### Entry Criteria
- PRD / FRD is signed off and available
- Test environment (staging) is provisioned and accessible
- SmartCode / SDK is installed on test application
- Test data (test accounts, test websites) is created
- Test cases are reviewed and approved
- All P0/P1 blockers from previous cycle are resolved

### Exit Criteria
- All planned test cases are executed (100% pass rate for P0/P1)
- No open P0/P1 defects
- All P2/P3 defects are triaged and documented
- Test Summary Report is submitted
- Sign-off obtained from QA Lead and Product Owner

---

## 10. Test Execution
- Testers will execute test cases from JIRA / Test Case sheet
- Daily stand-up at 9:30 AM IST for status update
- Weekly test execution report to stakeholders every Friday
- Defect triage meeting daily at 10:00 AM IST
- All failed test cases must be linked to a JIRA defect
- Regression suite to be executed after every major build deployment
- Automation suite to be triggered via CI/CD pipeline on every merge to main branch

---

## 11. Test Closure
- Verify all exit criteria are met
- Prepare and share Test Summary Report including:
  - Total test cases planned vs executed
  - Pass / Fail / Blocked counts
  - Defect metrics (opened, closed, open by severity)
  - Test coverage analysis
  - Lessons learned
- Archive test artifacts (test cases, scripts, reports)
- Obtain formal sign-off from QA Lead, Dev Lead, and Product Owner
- Handover automation scripts to Ops team for ongoing regression

---

## 12. Tools

| Tool | Purpose |
|------|---------|
| JIRA | Test case management, defect tracking |
| Playwright | Web UI automation |
| REST Assured / Postman | API testing |
| BrowserStack | Cross-browser testing |
| GitHub Actions | CI/CD pipeline |
| Slack | Team communication & alerts |
| VWO Debugger | SmartCode & campaign debugging |
| Chrome DevTools | Network, console, performance analysis |
| OWASP ZAP | Security testing |
| Android Studio / Xcode | Mobile app testing |
| TestRail (optional) | Test case management alternative |
