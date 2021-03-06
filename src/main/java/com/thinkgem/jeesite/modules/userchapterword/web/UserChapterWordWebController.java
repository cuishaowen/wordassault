package com.thinkgem.jeesite.modules.userchapterword.web;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.modules.userchapterword.service.UserChapterWordService;
import com.thinkgem.jeesite.modules.word.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "userchapterword")
public class UserChapterWordWebController {

    @Autowired
    private UserChapterWordService userChapterWordService;

    /**
     * 已学词汇
     * @param userId
     * @param courseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "completeword")
    public List<CompletionWord> getCompletionWord(String userId, String courseId){
        return userChapterWordService.getCompletionWord(userId,courseId);
    }


    /**
     * 未学词汇
     * @param userId
     * @param courseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "waitLearning")
    public List<WaitLearningWord> getWaitLearningWord(String userId, String courseId){
        return userChapterWordService.getWaitLearningWord(userId,courseId);
    }

    /**
     * 熟记词汇
     * @param userId
     * @param courseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getSkilled")
    public List<SkilledWord> getSkilledWord(String userId, String courseId){
        return userChapterWordService.getSkilledWord(userId,courseId);
    }

    /**
     * 备忘词汇
     * @param userId
     * @param courseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getStrengthenMemory")
    public List<StrengthenMemoryWord> getStrengthenMemoryWord(String userId, String courseId){
        return userChapterWordService.getStrengthenMemoryWord(userId, courseId);
    }

    /**
     * 消灭生词
     * @param userId
     * @param courseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getKillCourseHard")
    public List<HardKilledWord> getKillCourseHardWord(String userId, String courseId){
        return userChapterWordService.getKillCourseHardWord(userId, courseId);
    }

    /**
     * 难记词汇
     * @param userId
     * @param courseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getCourseHard")
    public List<HardWord> getCourseHardWord(String userId, String courseId){
        return userChapterWordService.getCourseHardWord(userId, courseId);
    }

    /**
     * 获取章节下的所有的单词信息和例句
     * @param chapterId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getWordInformation")
    public List<WordInformation> getWordInformation(String chapterId){
        return userChapterWordService.getWordInformation(chapterId);
    }

    /**
     * 获取章节下的所有的单词信息和例句
     * @param chapterId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getWordInformationPage")
    public Page<WordInformation> getWordInformationPage(String chapterId,Integer pageNum){
        List<WordInformation> wordInformations =  userChapterWordService.getWordInformation(chapterId);
        Page<WordInformation> wordInformationPage = new Page<WordInformation>();
        WordInformation wordInformation = new WordInformation();
        wordInformation.setPage(wordInformationPage);
        wordInformationPage.setCount(wordInformations.size());
        wordInformationPage.setPageSize(1);
        wordInformationPage.setPageNo(pageNum);
        wordInformationPage.setList(wordInformations);
        return wordInformationPage;
    }

}
