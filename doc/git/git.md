# git 命令

1. 初始化: git init
2. 添加文件到版本库: git add something
3. 提交本次修改: git commit -m '提交信息'
4. 查看当前修改状态: git status
5. 查看文件变更内容: git diff
6. 查看 git 记录: git log
7. 查看 git 提交记录: git reflog
8. 版本回退
   - 回退到上一版本: git reset --hard HEAD^
   - 回退到指定版本: git reset --hard {{版本号}}
9. 丢弃工作区的修改: git checkout -- {{filename}} 。--是必须的
10. 撤销暂存区的修改放到工作区: git reset HEAD {{filename}}
11. 从版本库中删除文件: git rm {{filename}}
12. 本地仓库关联到远程仓库: git remote add origin {{gitpath}}
13. 本地库推送到远程: git push -u origin master

    > 一次推送 master 分支时，加上了-u 参数，Git 不但会把本地的 master 分支内容推送的远程新的 master 分支，还会把本地的 master 分支和远程的 master 分支关联起来，在以后的推送或者拉取时就可以简化命令

14. 打标签: git tag {{tagName}} {{commitId}}

## 分支管理

---

1. 创建新的分支并切换 : git checkout -b {{branchName}}

```shell
git checkout命令加上-b参数表示创建并切换，相当于以下两条命令
git branch {{branchName}}   创建分支
git checkout {{branchName}} 切换分支
```

2. 合并分支: git merge {{branchName}}
3. 删除分支: git branch -d {{branchName}}
4. 查看分支: git branch
5. 指定远程链接: git branch --set-upstream-to=origin/dev dev

## git 储藏

- git stash :暂存当前的工作现场
- git stash apply: 恢复但不删除
- git stash drop: 删除
- git stash pop: git stash apply + git stash drop

## git rebase

> git rebase 命令在另一个分支基础之上重新应用，用于把一个分支的修改合并到当前分支。
