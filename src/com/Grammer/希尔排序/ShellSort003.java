package com.Grammer.希尔排序;

import com.sun.javafx.robot.FXRobotImage;

public class ShellSort003 {
/**就在这里写写自己的新的吧
 * 最近几天,自己的心不知道为什么,就是非常的浮躁,虽然现在没有什么事情,但是自己不知道为什,就是不想干活,
 * 连自己的算法也是不想再去看,就是再不停的寻找借口,寻找理由,自己看着自己都非常的烦,我不能够去吃苦,
 * 自律部起来,非常的堕落,还有就是开始厌恶现在必须做的事情,自己在断送自己的额前程v啊.贪图享乐3,天天混吃等死.
 * 代码看看就想放弃,自己数也不看了,活也不干了.心情查到极点,如果说自己不学的话,那我也没有啥话好说的;但偏偏就是
 * 你玩有不能静下心来玩,学又不能静下心来学,最终导致的是自己心灵憔悴,还一事无成,不管是在精神上还是在肉体上,
 * 都是处于自己一种让自己恶心的状态.就比如下面的算法:希尔排序,我就一点也不想看,也不想去弄.但我又不能真正的去放下,
 * 但我有欺骗式的打开时,自己就是一股茫然飘上心头和有种无奈的感觉在心中飘荡,最终的结果:自己什么也没有做成.但增加自己颓废的
 * 情绪在心中,真特么的难受.不知道为什,自己就是非常的烦.
 * 思绪也不对,整天就知道在胡思乱想,但就是缺了最关键的一环,action!!!玛德,只会嘴BB,连看书我现在都懒的看,我都到这个地步了.
 * 就会自己堕落,严重的懒散.
 *
    */
//    public static void pringtarray
    int sort(int arr[]){
        int n=arr.length;
        for (int gap=n/2;gap>0;gap/=2){
            for (int i = 0; i < n; i+=1) {
                int temp=arr[i];
                int j;
                for (int k = i; k >=gap&&arr[k-gap]>temp; k-=gap) {
                    arr[k]=arr[k-gap];
                    arr[k]=temp;
                }
            }

        }
        return 0;
    }
}
