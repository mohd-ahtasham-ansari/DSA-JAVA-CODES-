public class majority {
    def majorityElement(nums):
            # Phase 1: Find potential candidates
    candidate1, candidate2, count1, count2 = None, None, 0, 0

            for num in nums:
            if num == candidate1:
    count1 += 1
    elif num == candidate2:
    count2 += 1
    elif count1 == 0:
    candidate1, count1 = num, 1
    elif count2 == 0:
    candidate2, count2 = num, 1
            else:
    count1 -= 1
    count2 -= 1

            # Phase 2: Verify the candidates
    result = []
    n = len(nums)
    for c in [candidate1, candidate2]:
            if c is not None and nums.count(c) > n // 3:
            result.append(c)

            return result

}
