# mvc
 ### springmvc 简单版本
 ### idea git的使用
    echo "# mvc" >> README.md  --创建md文件
    echo >> .gitignore --创建gitignore文件 过滤不需要提交的文件和目录
    git init   --初始化本地仓库并添加git版本控制
    git status --查看文件变化
    git add .  --添加变更文件
    git commit -am "first commit" --提交至本地仓库并设置提交信息
                                  --小知识：git commit -m用于提交暂存区的文件，git commit -am用于提交跟踪过的文件
                                  --小知识: window环境 注释要用双引号，mac,gitlinux用单引号
    git remote add origin https://github.com/shiming-miku/mvc.git --连接到远程仓库
    git push -u origin master --提交到远程仓库git
    git pull --更新文件