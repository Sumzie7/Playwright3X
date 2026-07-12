# DeepSeek V4 Pro Setup in Visual Studio

## Step 1: Install Visual Studio
- Install Visual Studio 2022 or later.
- During installation, ensure the following workloads are selected:
  - ASP.NET and web development
  - .NET desktop development
  - Node.js development (optional, if you plan to use JavaScript/TypeScript projects)

## Step 2: Install the required extensions
- Open Visual Studio.
- Go to Extensions > Manage Extensions.
- Search and install:
  - C# Dev Kit
  - IntelliCode
  - GitHub Copilot (if you use GitHub AI features)

## Step 3: Configure DeepSeek V4 Pro
- Open Visual Studio Settings.
- Go to Tools > Options.
- In the search box, search for "AI" or "Extensions".
- If your environment supports external AI providers, add the DeepSeek V4 Pro endpoint and API key in the relevant settings section.
- If you are using a custom extension or connector for DeepSeek, install that extension and enter your provider details.

## Step 4: Verify the setup
- Open a sample project in Visual Studio.
- Try the AI assistant or extension panel.
- Confirm that DeepSeek V4 Pro responses appear correctly.

## Step 5: Useful notes
- Keep your API key secure.
- Do not hardcode secrets in source files.
- Store keys in environment variables or secure configuration files.

## Troubleshooting
- If the provider does not appear, restart Visual Studio.
- If authentication fails, verify the API key and endpoint URL.
- If the extension is missing, reinstall it from the Visual Studio Marketplace.
