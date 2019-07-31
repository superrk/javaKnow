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

```
一次推送master分支时，加上了-u参数，Git不但会把本地的master分支内容推送的远程新的master分支，还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令
```

## 分支管理

---

1. 创建新的分支 : git checkout -b {{branchName}}
