
# Git Ignore Hands-On Lab 

This lab demonstrates how to use `.gitignore` to exclude unwanted files and folders from being tracked in a Git repository.

---

## Objectives

- Learn how to create and use `.gitignore` files
- Ignore specific file types and folders (e.g., `.log`, `log/`)

---

## Prerequisites

- Git is installed and configured (`git config` done)
- Notepad++ is set as the default Git editor (optional)
- A local Git repository (`git init` already run)
- A remote Git repository (GitHub or GitLab)

---

## Steps to Ignore Files

### Step 1: Create Unwanted Files

```bash
echo "This is a log file." > debug.log
mkdir log
echo "Logs go here." > log/example.log
```

### Step 2: Create or Edit `.gitignore`

```bash
notepad .gitignore
```

Add the following lines inside `.gitignore`:

```gitignore
*.log
log/
```

This tells Git to ignore:
- Any file ending in `.log`
- The entire `log` folder

### Step 3: Check Status

```bash
git status
```

You should see that `debug.log` and everything inside `log/` are now ignored by Git.

---

## Final Notes

- `.gitignore` only affects **untracked files**. If a file is already tracked, you must remove it with:

```bash
git rm --cached filename
```

- You can create project-level or global `.gitignore` files.

---

## Directory Snapshot

```bash
GitDemo/
├── .gitignore
├── welcome.txt
├── debug.log         # ignored
├── log/              # ignored
│   └── example.log
```

---

## Useful Commands

```bash
git add .gitignore
git commit -m "Add .gitignore to exclude .log files and log folder"
git push
```
