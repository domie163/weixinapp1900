const base = {
    get() {
        return {
            url : "http://localhost:8080/yuyankexuexixitong/",
            name: "yuyankexuexixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yuyankexuexixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "语言课学习系统"
        } 
    }
}
export default base
