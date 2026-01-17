def maxSubarraySumCircular(nums):
    global_max = nums[0]
    curr_max = -999999

    curr_min = 999999
    global_min = nums[0]

    total = 0

    for i in range(len(nums)):

        
        curr_min = min(curr_min + nums[i], nums[i])
        curr_max = max(curr_max + nums[i], nums[i])

        total += nums[i]

        global_max = max(global_max, curr_max)
        global_min = min(global_min, curr_min)

    return max(global_max, total-global_min) if global_max > 0 else global_max
    
nums = [-2,4,-5,4,-5,9,4]
print(maxSubarraySumCircular(nums))