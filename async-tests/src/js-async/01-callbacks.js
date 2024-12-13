/**
 * Invoke the callback and return the amount of time in miliseconds it took to execute
 */
exports.profileFunc = function (cb) {
        const startTime = Date.now();  // Capture the time before the callback
        cb();  // Invoke the callback
        const endTime = Date.now();  // Capture the time after the callback
    
        return endTime - startTime;  // Return the time difference (milliseconds)
};

/**
 * Invoke the async callback with the provided value after some delay
 */
exports.returnWithDelay = function (value, delay, cb) {
    setTimeout(function () {
        cb(null, value);  // Invoke the callback with no error (null) and the provided value
    }, delay);
};

/**
 * Invoke the async callback with an error after some delay
 */
exports.failWithDelay = function (delay, cb) {
    setTimeout(function () {
        const error = new Error('Something went wrong');  // Create an error object
        cb(error, null);  // Invoke the callback with the error as the first argument
    }, delay);
};

/**
 * Return a promise that resolves after the specified delay
 * or rejects if the delay is negative or non-existent
 */
exports.promiseBasedDelay = function (delay) {
    return new Promise(function (resolve, reject) {
        
        // Validate the delay
        if (typeof delay !== 'number' || delay <= 0) {
            reject(new Error('Invalid delay time'));  // Reject the promise if the delay is invalid
            return;
        }

        // Resolve the promise after the specified delay
        setTimeout(function () {
            resolve();  // The promise resolves after the delay
        }, delay);
    });
};